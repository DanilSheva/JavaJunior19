package Lesson8;

public class Triangle {
    private int sideA;
    private int sideB;
    private int sideC;


   public  Triangle(){

   }
   public Triangle (int sideA,int sideB, int sideC){
       this.sideA= sideA;
       this.sideB= sideB;
       this.sideC = sideC;

   }




    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;


    }

    public void setSideC(int sideC) {
        this.sideC = sideC;

    }
    public int getSideA (){
       return this.sideA;
    }

    public void printTypeTriangle() {
        if (sideA == sideB && sideB == sideC && sideC == sideA) {
            System.out.println("равносторонний треугольник");


        }
        else if (sideA != sideB && sideB != sideC && sideC != sideA){
            System.out.println("Треугольник разносторонний");

        } else{
            ;
            System.out.println("Равнобедренный треугольник");
        }

    }

}




