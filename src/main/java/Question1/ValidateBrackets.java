package Question1;


public class ValidateBrackets {

    //default constructor
    public ValidateBrackets() {
    }


    public boolean validBrackets1(String[] test) {
        UserStack<Character> openingStack = new ArrayListStack<Character>();
        UserStack<Character> closingStack = new ArrayListStack<Character>();
        Character current;
        int counter =0;

        //iterate over the test string and assign char to current var
        for (int i = 0; i < test.length; i++) {
            for (int j = 0; j < test[i].length(); j++) {
                current = test[i].charAt(j);
                //compensate for if a  string has '{' or '}' within the code
                if(current == '"'){
                    counter++;
                }
                if(counter % 2 == 0){
                    // push on opening brackets
                    if(current == '{'){
                        openingStack.push(current);
                    }
                    //push on closing brackets
                    if(current == '}'){
                        closingStack.push(current);
                    }
                }
            }
        }
        if(openingStack.size() != closingStack.size()){
            return false;
        }
        return true;
    }
}
