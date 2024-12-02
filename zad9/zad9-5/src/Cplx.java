public class Cplx {
    private double rzeczywista;
    private double urojona;

    Cplx(double rzeczywista, double urojona)
    {
        this.rzeczywista=rzeczywista;
        this.urojona=urojona;
    }
    
    public void add(Cplx x)
    {
        this.rzeczywista+=x.rzeczywista;
        this.urojona+=x.urojona;
    }

    public void sub(Cplx x)
    {
        this.rzeczywista-=x.rzeczywista;
        this.urojona-=x.urojona;
    }

    public void mul(Cplx x)
    {
        double tempRzeczywista=(this.rzeczywista * x.rzeczywista - this.urojona * x.urojona);
        
        this.urojona=(this.rzeczywista * x.urojona + this.urojona * x.rzeczywista);
        this.rzeczywista=tempRzeczywista;
    }

    public void inc()
    {
        this.rzeczywista++;
    }

    public void show()
    {
        System.out.println(rzeczywista + " + " + urojona + "i");
    }
}
