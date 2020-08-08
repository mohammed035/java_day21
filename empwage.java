public class empwage
{
        public static final int IS_FULL_TIME=1;
        public static final int EMP_RATE_PER_HOUR=20;
        public static int EmpWage1()
        {
        int emphrs=0;
                  int totalemphrs=0;
                        int empWage=0;
        int empcheck=(int)Math.floor(Math.random()*10)%3;
                if(empcheck==IS_FULL_TIME)
                        {
                                emphrs=8;
                        }
                else
                                emphrs=0;
                                        empWage=emphrs*EMP_RATE_PER_HOUR;
               System.out.println("employee wage"+empWage);
                                        return empWage;
        }
         public static void main(String[] args)

        {
        EmpWage1();

        }
}
