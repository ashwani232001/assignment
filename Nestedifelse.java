class Nestedifelse {
	public static void main(String[] args)
	{
	 int age = 120;
        if (age <= 12) {
            System.out.println("you are Kid");
        } else if (age >= 13) {
            System.out.println("you are Teenager");
        } else if (age >= 20) {
            System.out.println("you are Adult");
        } else if (age >= 60) {
            System.out.println("you are senior citizen");
            if(age<=110){
                System.out.println("you are senior citizen");
            }
        } else {
            System.out.println("you are Immortal '.' ");
        }
	}
}

