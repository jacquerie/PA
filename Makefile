all:
	javac -cp src src/*.java

clean:
	rm -f final.aux final.log final.pyg

pdf:
	pdflatex --shell-escape tex/final.tex

run:
	java -cp src Main

.PHONY: all clean pdf run
