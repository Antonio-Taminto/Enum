public class Rettangolo extends Forma{

    @Override
    public void calcolaArea(int b,int a) {
        int area = b * a;
        System.out.println(area +" "+ TipoEnum.RETTANGOLO.getTipo());
    }
}
