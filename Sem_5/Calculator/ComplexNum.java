package Calculator; // Сложение комплексных чисел
public class ComplexNum {
    double real, img;
    ComplexNum(double r, double i){
        this.real = r;
        this.img = i;
    }
    public ComplexNum sum(ComplexNum c1, ComplexNum c2)
    {
        ComplexNum temp = new ComplexNum(0, 0);
        temp.real = c1.real + c2.real;
        temp.img = c1.img + c2.img;
        return temp;
    }

    public void main(String args[]) {
        ComplexNum c1 = new ComplexNum(5.5, 4);
        ComplexNum c2 = new ComplexNum(1.2, 3.5);
        ComplexNum temp = sum(c1, c2);
        System.out.printf("Сумма равна : "+ temp.real+" + "+ temp.img +"i");
        System.out.println();
    }
}

