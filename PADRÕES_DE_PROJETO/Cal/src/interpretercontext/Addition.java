package interpretercontext;

public class Addition implements Operate
{
    private Operate left;
    private Operate right;


    public Addition(Operate left, Operate right)
    {
        this.left = left;
        this.right = right;
    }

    @Override
    public double interpreterContext()
    {
        return this.left.interpreterContext() + this.right.interpreterContext();
    }
}

