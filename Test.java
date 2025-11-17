class Test 
{
    protected void finalize() 
{
        System.out.println("Object is garbage collected");
    }

    public static void main(String[] args)
 {
        Test obj = new Test();
        obj = null;
        System.gc(); // JVM may call finalize()
    }
}
