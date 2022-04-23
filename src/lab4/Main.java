package lab4;

/*
В данной лабораторной с помощью метода readFile() считывается файл с несколькими строками, в которых записаны
арифметические выражения. Внутри этого метода используется метод findArithmeticExpression(), который отвечает за
поиск этих выражений и их вычисления.

*/
public class Main {
    public static void main(String[] args){
        ReadAndFind raf = new ReadAndFind();
        raf.readFile("text.txt");
    }
}
