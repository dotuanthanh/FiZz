public class FizzBuzz {
    int number;

    public String fizzBuzz(int number) {
        this.number=number;
        boolean isFizz = number % 3 == 0;
        boolean isBuzz = number % 5 == 0;

        if (isFizz && isBuzz)
            return "FizzBuzz";

        if (isFizz)
            return "Fizz";

        if (isBuzz)
            return "Buzz";

        return "";
    }

    public String getName() {
        String text = " ";
        if (number < 100) {
            int donVi = number % 10;
            int hangChuc = number / 10;
            String[] docHangDonVi = {"khong", "mot", "hai", "ba", "bon", "nam", "sau", "bay", "tam", "chin"};
            String[] docHangChuc = {"khong", "mot", "hai", "ba", "bon", "nam", "sau", "bay", "tam", "chin"};
            if (docHangDonVi[hangChuc] == "khong") {
                if (docHangDonVi[donVi] == "khong") {
                    text = "";
                } else {
                    text = docHangDonVi[donVi];
                }
            }
            else {
                if(docHangDonVi[donVi]=="khong"){
                    text=docHangChuc[hangChuc] +" muoi ";
                }
                else{
                    text=docHangChuc[hangChuc] +" muoi "+docHangDonVi[donVi];
                }
            }

        }
        return text;
    }

    @Override
    public String toString() {
        return "FizzBuzz{" +
                "number=" + number + " Doc la  " + getName()+
                '}';
    }
}
