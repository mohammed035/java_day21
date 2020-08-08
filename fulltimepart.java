public class fulltimepart
{
        public static final int IS_FULL_TIME=1;
        public static final int IS_PART_TIME=2;
        public static final int EMP_RATE_PER_HOUR=20;
        public static int EmpWage()
        {
        int empHrs=0,totalemphrs=0;
        int empCheck=(int)Math.floor(Math.random()*10)%3;
                 if(empCheck==IS_FULL_TIME)
                        {
                                empHrs=8;
                        }
                else if(empCheck==IS_PART_TIME)
                        {
                                empHrs=4;
                        }
                else
                                empHrs=0;

        int Empwage = empHrs*EMP_RATE_PER_HOUR;
        System.out.println("Total employee wage is : "+Empwage);
        return Empwage;
        }
         public static void main(String[] args)

        {
        EmpWage();

        }
}

