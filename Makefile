clean:
	rm -f final.aux final.log final.pyg

pdf:
	pdflatex --shell-escape tex/final.tex

.PHONY: clean pdf
