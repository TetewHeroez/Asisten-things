\ProvidesClass{../praktikum-ppt}

\LoadClass[aspectratio=169]{beamer}

\RequirePackage{colortbl,tabularx,mathrsfs,calligra,xcolor}
\RequirePackage{amsmath,amsfonts,amssymb,amsthm}
\RequirePackage{ragged2e}
\RequirePackage{setspace}
\RequirePackage{caption}
\RequirePackage{subcaption}
\RequirePackage{contour}
\RequirePackage{animate}
\RequirePackage{fancybox}
\RequirePackage{wrapfig}
\RequirePackage[bahasa]{babel}
\RequirePackage{multirow}
\RequirePackage{multicol}
\RequirePackage{tkz-euclide,calc,pgfmath}
    \usetikzlibrary{patterns,decorations,shapes.arrows,shapes.geometric,arrows,positioning}
\RequirePackage{listings}
\RequirePackage{pifont}
\RequirePackage[scaled]{berasans}
    \renewcommand*\familydefault{\sfdefault}
\RequirePackage[T1]{fontenc}
\RequirePackage{hyperref}
\hypersetup{
    filecolor=magenta,      
    urlcolor=cyan,
}
\RequirePackage{algorithm}
\RequirePackage{algpseudocode}
\RequirePackage{pgfplots}
    \pgfplotsset{compat=1.18}
\RequirePackage{soul}

\renewcommand*\familydefault{\sfdefault} %% Only if the base font of the document is to be sans serif

\graphicspath{{C:/Users/teoso/OneDrive/Documents/Asisten Dosen & Lab/Asisten Laboratorium/Alpro 1/PPT/Graphicx/}}

\definecolor{HIMAmuda}{HTML}{01D1FD}
\definecolor{HIMAtua}{HTML}{02016A}
\definecolor{HIMAabu}{HTML}{CBCBCC}
\definecolor{PastelGreen}{HTML}{77DD77}
\definecolor{pgray}{rgb}{0.5,0.5,0.5}
\definecolor{pblue}{rgb}{0.13,0.13,1}
\definecolor{pgreen}{rgb}{0,0.5,0}
\definecolor{pred}{rgb}{0.9,0,0}
\definecolor{pgrey}{rgb}{0.46,0.45,0.48}
\definecolor{pcyan}{HTML}{D4EFFC}
\definecolor{lblue}{HTML}{00AEEF}
\definecolor{input}{HTML}{AAE1FA}
\definecolor{bg}{rgb}{0.95, 0.95, 0.92}
\definecolor{vscode}{HTML}{282A36}
\definecolor{berlin}{HTML}{023047}

\usetheme{Madrid}

\setbeamercolor{palette primary}{bg=HIMAtua,fg=white}
\setbeamercolor{palette secondary}{bg=HIMAmuda,fg=black}
\setbeamercolor{palette tertiary}{bg=HIMAabu,fg=black}
\setbeamercolor{palette quaternary}{bg=HIMAmuda,fg=white}
\setbeamercolor{structure}{fg=HIMAmuda} % itemize, enumerate, etc
\setbeamercolor{section in toc}{fg=HIMAtua} % TOC sections
\setbeamercolor{block title alerted}{fg=white,bg=magenta}
\setbeamercolor{block body alerted}{fg=black!90,bg=pink}

\usefonttheme{professionalfonts}
\setbeamertemplate{theorems}[numbered]

\usebackgroundtemplate{%
\tikz[overlay,remember picture] \node[opacity=0.1, at=(current page.center)]{\includegraphics[width=\paperwidth]{plana class}};
}

\renewcommand\thesubfigure{\arabic{subfigure}}
\newtheorem*{funfact}{Fun Fact}
\newtheorem*{definisi}{Definisi}
\newtheorem{teorema}{Teorema}
\theoremstyle{definition}
\newtheorem{latihan}{Latihan}
\newtheorem{game}{Game}
\newtheorem*{contoh}{Contoh}
\newtheorem*{masalah}{Masalah}
\newtheorem*{akibat}{Akibat}
\newcommand{\R}{\mathbb{R}}

\AtBeginEnvironment{contoh}{%
    \setbeamercolor{block title}{use=example text,fg=white,bg=example text.fg!75!black}
    \setbeamercolor{block body}{parent=normal text,use=block title example,bg=block title example.bg!10!bg}
    \setbeamercolor{item}{fg=example text.fg}
}

\AtBeginEnvironment{funfact}{%
  \setbeamercolor{block title}{fg=white,bg=PastelGreen!50!HIMAmuda} 
  \setbeamercolor{block body}{parent=normal text,bg=PastelGreen!50!HIMAmuda!30!white} 
  \setbeamercolor{item}{fg=PastelGreen!50!HIMAmuda}
}
\AtBeginEnvironment{definisi}{
    \setbeamercolor{block title}{fg=white,bg=HIMAtua}
    \setbeamercolor{block body}{parent=normal text,bg=HIMAtua!30!white}
    \setbeamercolor{item}{fg=HIMAtua}
}
\AtBeginEnvironment{teorema}{
    \setbeamercolor{block title}{bg=darkgray,fg=white}
    \setbeamercolor{block body}{parent=pallette tertiary,bg=HIMAabu!30!white}
    \setbeamercolor{item}{fg=darkgray}
}
\AtBeginEnvironment{latihan}{%
  \setbeamercolor{block title}{fg=white,bg=PastelGreen} 
  \setbeamercolor{block body}{parent=normal text,bg=PastelGreen!30!white} 
  \setbeamercolor{item}{fg=PastelGreen}
}
\AtBeginEnvironment{masalah}{%
  \setbeamercolor{block title}{fg=white,bg=teal} 
  \setbeamercolor{block body}{parent=normal text,bg=teal!30!white} 
  \setbeamercolor{item}{fg=teal}
}
\AtBeginEnvironment{akibat}{%
  \setbeamercolor{block title}{fg=white,bg=brown} 
  \setbeamercolor{block body}{parent=normal text,bg=brown!30!white} 
    \setbeamercolor{item}{fg=brown}
}
\AtBeginEnvironment{game}{%
  \setbeamercolor{block title}{fg=white,bg=berlin} 
  \setbeamercolor{block body}{parent=normal text,bg=berlin!30!white} 
    \setbeamercolor{item}{fg=berlin}
}

\renewcommand{\arraystretch}{1.3}
\renewcommand{\lstlistingname}{Kode}

\usepackage{listings}

\lstdefinestyle{standard}{
    language            = Java,
    showspaces          = false,
    showtabs            = false,
    breaklines          = true,
    showstringspaces    = false,
    breakatwhitespace   = true,
    commentstyle        = \color{pgray},
    keywordstyle        = \color{pblue},
    stringstyle         = \color{pgreen},
    basicstyle          = \footnotesize\ttfamily,
    frame               = shadowbox,
    backgroundcolor     = \color{brown!10!white},
    escapeinside        = {(*}{*)},
    numbers             = left, % {none, left, right}
    numberstyle         = \scriptsize\color{lightgray},
    numbersep           = -8pt,
    rulesepcolor        =\color{brown!50!black}
    }

\lstdefinestyle{output}{
    language=Java,
    backgroundcolor     =\color{vscode},
    basicstyle          =\footnotesize\ttfamily\color{white},
    frame               =shadowbox,
    escapeinside        ={(*}{*)},
    showspaces          =false,
    showtabs            =false,
    breaklines          =true,
    showstringspaces    =false,
    breakatwhitespace   =true,
    rulesepcolor        =\color{HIMAtua!50!white},
    rulecolor           =\color{HIMAtua!50!white},
    numbers             =none,
    }

\lstset{style=standard}

\tikzstyle{startstop} = [rectangle, rounded corners, 
minimum width=2cm, 
minimum height=1cm,
text centered, 
draw=black, 
fill=pink]

\tikzstyle{io} = [trapezium, 
trapezium stretches=true, 
trapezium left angle=70, 
trapezium right angle=110, 
minimum width=2cm, 
minimum height=1cm, text centered, 
draw=black, fill=HIMAmuda]

\tikzstyle{process} = [rectangle, 
minimum width=2cm, 
minimum height=1cm, 
text centered, 
text width=2cm, 
draw=black, 
fill=HIMAabu]

\tikzstyle{decision} = [diamond, 
minimum width=2cm, 
minimum height=1cm, 
text centered, 
draw=black, 
fill=PastelGreen]

\tikzstyle{arrow} = [thick,->,>=stealth]

\tikzstyle{sumjunction} = [draw,
    circle,
    minimum size=1cm,
    text centered,
    path picture={
      \draw [black] % atau pakai warna lain yang pasti ada
        (path picture bounding box.135) -- (path picture bounding box.315)
        (path picture bounding box.45) -- (path picture bounding box.225);
    }
]

\newcommand{\enter}{\raisebox{-1.8pt}{\begin{tikzpicture}[scale=0.3]
    \draw[thin,fill=gray] (0,0) rectangle (2,1);
    \draw (0.3,0.3) -- (0.7,0.3)--(0.7,0.6);     
\end{tikzpicture}}}

\newcommand{\inputscan}[1]{\raisebox{0pt}[1pt]{\colorbox{darkgray}{#1}}}

\newcommand{\bigO}{\mathcal{O}}