package Array;

class ArrayTest1{
    public static void main(String[] args) {
        if(args[1].equals("*"))
            System.out.println(args[0]+args[1]+args[2]+"="+(Integer.parseInt(args[0])*Integer.parseInt(args[2])));
        else if(args[1].equals("+"))
            System.out.println(args[0]+args[1]+args[2]+"="+(Integer.parseInt(args[0])+Integer.parseInt(args[2])));
        else if(args[1].equals("-"))
            System.out.println(args[0]+args[1]+args[2]+"="+(Integer.parseInt(args[0])-Integer.parseInt(args[2])));
        else if(args[1].equals("/"))
            System.out.println(args[0]+args[1]+args[2]+"="+(Integer.parseInt(args[0])/Integer.parseInt(args[2])));
    }
}