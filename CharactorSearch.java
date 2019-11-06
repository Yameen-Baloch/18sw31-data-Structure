class CharactorSearch{
    public static void main(String[] args) {
        char[] c = new char[]{'a', 'b', 'c', 'd', 'e'};
        System.out.println(CharactorSearch.Search(c, 'c'));
    }

    public static String Search(char crr[], char c){
        for(int i = 0; i < crr.length; i++){
            if(crr[i] == c){
                return (c+" found at index "+i);
            }
        }
        return (c+" Not found");
    }
}