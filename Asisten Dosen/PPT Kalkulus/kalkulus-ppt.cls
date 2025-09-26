\ProvidesClass{../../kalkulus-ppt}

\LoadClass[aspectratio=169]{beamer}

% --- Packages ---
\RequirePackage{pgf}
\RequirePackage{colortbl}
\RequirePackage{tabularx}
\RequirePackage{mathrsfs}
\RequirePackage{calligra}
\RequirePackage{xcolor}
\RequirePackage{amsmath}
\RequirePackage{amsfonts}
\RequirePackage{amssymb}
\RequirePackage{amsthm}
\RequirePackage{ragged2e}
\RequirePackage{setspace}
\RequirePackage{filecontents}
\RequirePackage{caption}
\RequirePackage{subcaption}
\RequirePackage{contour}
\RequirePackage{fancybox}
\RequirePackage{wrapfig}
\RequirePackage{multirow}
\RequirePackage{multicol}
\RequirePackage{tikz}
\RequirePackage{pgfplots}
\RequirePackage{tkz-euclide}
\RequirePackage{calc}
\RequirePackage{listings}
\RequirePackage{pifont}
\RequirePackage[scaled]{uarial}
\renewcommand*\familydefault{\sfdefault}
\RequirePackage[T1]{fontenc}

\pgfplotsset{compat=1.18}

% --- TikZ libraries ---
\AtBeginDocument{%
    \usetikzlibrary{patterns,decorations,shapes.arrows,shapes.geometric,fit,matrix,positioning}
}

% --- Math operator ---
\DeclareMathOperator{\sign}{sgn}

% --- Graphics path ---
\graphicspath{{C:/Users/teoso/OneDrive/Documents/Asisten Dosen & Lab/Asisten Dosen/PPT Kalkulus/Gambar & Logo/}{D:/Hada Touya/Asisten-things/Asisten Dosen/PPT Kalkulus/Gambar & Logo/}}

% --- Colors ---
\definecolor{HIMAmuda}{HTML}{01D1FD}
\definecolor{HIMAtua}{HTML}{02016A}
\definecolor{HIMAabu}{HTML}{CBCBCC}
\definecolor{PastelGreen}{HTML}{77DD77}

% --- Beamer theme and colors ---
\usetheme{Madrid}

\setbeamercolor{palette primary}{bg=HIMAtua,fg=white}
\setbeamercolor{palette secondary}{bg=HIMAmuda,fg=black}
\setbeamercolor{palette tertiary}{bg=HIMAabu,fg=black}
\setbeamercolor{palette quaternary}{bg=HIMAmuda,fg=white}
\setbeamercolor{structure}{fg=HIMAmuda}
\setbeamercolor{section in toc}{fg=HIMAtua}
\setbeamercolor{block title alerted}{fg=white,bg=magenta}
\setbeamercolor{block body alerted}{fg=black!90,bg=pink}

\usefonttheme{professionalfonts}
\setbeamertemplate{theorems}[numbered]

\usebackgroundtemplate{%
\tikz[overlay,remember picture] \node[opacity=0.1, at=(current page.center)]{\includegraphics[width=\paperwidth]{arona class}};
}

\renewcommand\thesubfigure{\arabic{subfigure}}
\newtheorem*{funfact}{Fun Fact}
\newtheorem{latihan}{Latihan}
\newtheorem{definisi}{Definisi}
\newtheorem{teorema}{Teorema}
\theoremstyle{definition}
\newtheorem*{contoh}{Contoh}
\newcommand{\R}{\mathbb{R}}

\AtBeginEnvironment{funfact}{%
    \setbeamercolor{block title}{fg=white,bg=PastelGreen}
    \setbeamercolor{block body}{parent=normal text,bg=PastelGreen!30!white}
}
\AtBeginEnvironment{definisi}{
        \setbeamercolor{block title}{fg=white,bg=HIMAtua}
        \setbeamercolor{block body}{parent=normal text,bg=HIMAtua!30!white}
        \setbeamercolor{item}{fg=HIMAtua}
}
\AtBeginEnvironment{teorema}{
        \setbeamercolor{block title}{bg=darkgray,fg=white}
        \setbeamercolor{block body}{parent=palette tertiary,bg=HIMAabu!30!white}
}
\AtBeginEnvironment{contoh}{%
    \setbeamercolor{block title}{fg=white,bg=PastelGreen}
    \setbeamercolor{block body}{parent=normal text,bg=PastelGreen!30!white}
    \setbeamercolor{item}{fg=PastelGreen}
}
\AtBeginEnvironment{alertblock}{%
    \setbeamercolor{item}{fg=red}
}