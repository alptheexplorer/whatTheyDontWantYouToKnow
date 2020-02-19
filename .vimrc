"main settings
set number
set showmatch
syntax on 
filetype plugin indent on
set wrap 
set ttyfast 
set encoding=utf-8

" plugin settings
call plug#begin('~/.vim/plugged')

Plug 'lervag/vimtex'
let g:tex_flavor='latex'
let g:vimtex_view_method='okular'
let g:vimtex_quickfix_mode=0
set conceallevel=1
let g:tex_conceal='abdmg'


Plug 'sirver/ultisnips'
let g:UltiSnipsExpandTrigger = '<tab>'
let g:UltiSnipsJumpForwardTrigger = '<tab>'
let g:UltiSnipsJumpBackwardTrigger = '<s-tab>'


Plug 'scrooloose/nerdcommenter'



"aliases

:nnoremap edit :e<space>$HOME/.vimrc
:nnoremap <leader>sv :source $MYVIMRC<cr>

:nnoremap save :w










