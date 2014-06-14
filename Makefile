all:
	@javac -cp src src/*.java -d bin

clean:
	rm -f final.aux final.log final.pyg

pdf:
	pdflatex --shell-escape tex/final.tex

run:
	@java -cp bin Main

.PHONY: all clean pdf run
