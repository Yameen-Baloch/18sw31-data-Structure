class StringSearch{
    public static void main(String[] args) {
        String[] arr = new String[]{"java", "is", "a", "Programming", "language"};
        System.out.println(StringSearch.Search(arr, "a"));
        
    }

    public static String Search(String str[], String s){
        for(int i = 0; i < str.length; i++) {
            if(str[i] == s){
                return (s+" Found at index "+i);
            }
        }
        return (s+ " Not Found");

    }
}