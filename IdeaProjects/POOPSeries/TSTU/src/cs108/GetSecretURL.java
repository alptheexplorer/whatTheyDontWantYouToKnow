package cs108;

public final class GetSecretURL {
    private static BoundedIntQueue newBoundedIntQueue(int capacity) {
        return new BoundedIntQueueBuggy(capacity);
    }

    public static void main(String[] args) {
        int secret = 2020;

        BoundedIntQueue queue = newBoundedIntQueue(30);

        for (int i = 0; i < 1723; ++i) {
            if (queue.size() < 9)
                queue.addLast(secret);
            else {
                switch (Math.abs(secret) % 5) {
                    case 4:
                        queue.addLast(queue.removeFirst() ^ (queue.removeFirst() << 3));
                        break;
                    case 0:
                    case 1:
                        queue.addLast(secret ^ queue.size());
                        if (!queue.isFull())
                            queue.addLast(i);
                        break;
                    case 2:
                        queue.addLast(queue.removeFirst());
                        break;
                    case 3:
                        int i1 = queue.removeFirst();
                        int i2 = queue.removeFirst();
                        queue.addLast(i1 ^ i2);
                        queue.addLast(i1 + i2);
                        break;
                }
                secret ^= queue.removeFirst() - queue.size();
            }
            secret ^= secret << 13;
            secret ^= secret >>> 17;
            secret ^= secret << 5;
        }

        System.out.println("Téléchargez le code source à cette adresse :");
        System.out.println("https://cs108.epfl.ch/+/" + Integer.toString(Math.abs(secret), 36) + "/BoundedIntQueueBuggy.java");
    }
}
