package constant;

public class hello{
    public static void main(String[] args){
       int D=63;
        double H=1.72;
        double BMI;
        BMI=D/(H*H);
        System.out.printf("身高为："+H);
        System.out.printf("体重为："+D);
        System.out.printf("BMI指数为："+BMI);
        if (BMI<18.5){
            System.out.printf("偏瘦");
        }
        if(BMI>=18.5&&BMI<24.9){
            System.out.println("正常");
        }
       if (BMI>=29.9&&BMI<29.9){
            System.out.println("过重");
        }
        else if (BMI>29.9){
            System.out.println("肥胖");
        }
    }
}
