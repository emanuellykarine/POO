public class Conversor{
    private int num;
    public Conversor(int num){
        setNum(num);
    }

    public void setNum(int num){
        if (num > 0) this.num = num;
        else throw new IllegalArgumentException("O numero precisa ser um inteiro positivo"); 
    }

    public int getNum(){
        return this.num;
    }

    public String Binario(){
        return Integer.toString(this.num, 2);
    }

    public String toString(){
        return String.format("Decimal = %.2f \n Binario = ", this.num, Integer.toString(this.num, 2));
    }

}

