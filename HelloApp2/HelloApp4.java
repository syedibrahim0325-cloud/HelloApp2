public class HelloApp4
{
    public static void main(String[] args) 
    {
        if(args.length == 0)
        {
            System.out.println("Hello, World!");
        }
        else
        {
            StringBuilder nameBuilder = new StringBuilder();

            for(int i = 0; i < args.length; i++)
            {
                nameBuilder.append(args[i]);

                if(i < args.length - 1)
                {
                    nameBuilder.append(", ");
                }
            }

            String name = nameBuilder.toString();

            System.out.println("Hello, " + name + "!");
        }
    }
}