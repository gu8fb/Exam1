class question8{
    public static void main(String[] args) {
        String [] test = {"phearn1@student.gsu", "phearn!@student.gsu", ".phearn.", "phearn.@gmai.com", "phearn@-test.com", "phearn@test.com-","phearn@test..com","phearn..sf@test.com"};

        for (int i = 0; i<test.length;i++){
            String invalid = test[i] + " is not a valid email address";
            String valid = test[i] + " is a valid email address";
            if(!test[i].contains("@")){
                System.out.println(invalid);
            }else{
                String [] test1 = test[i].split("@", 2);
                //System.out.println(test1[1].substring(0,1));
                if (test1[0].substring(0).equals(".")||test1[0].substring(test1[0].length()-1).equals(".")){
                    System.out.println(invalid);
                }else if (test1[0].contains("..")){
                    System.out.println(invalid);
                }else if (test1[1].substring(0,1).equals("-") || test1[1].substring(test1[1].length()-1).equals("-")){
                    System.out.println(invalid);
                }else if (!test1[1].contains(".")){
                    System.out.println(invalid);
                } else {
                    System.out.println(valid);
                }
            }
        }
        
        
    }
}