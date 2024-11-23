class Solution {
    public char[][] rotateTheBox(char[][] box) {
        int row = box.length;
        int col = box[0].length;

        char[][] rotatedBox = new char[col][row];  // Resultant matrix
        Stack<Character> stack = new Stack<>();  // Stack to manage stones (#) in the current row

        for(int r=0;r<row;r++){
            stack.clear(); // Clearing the stack for the current row
            for(int c=0;c<col;c++){
                // If an obstacle (*) is encountered
                if(box[r][c] == '*'){
                    rotatedBox[c][(row-1) - r] = '*';   // Putting the obstacle in the rotated box

                    // Filling the spaces above this obstacle
                    for(int newRow=c-1;newRow>=0;newRow--){
                        if(rotatedBox[newRow][(row-1) - r] == '*'){   
                            break;   // Stopping if another obstacle is found above in the rotatedBox
                        }
                        else{
                            if(stack.isEmpty()){
                                rotatedBox[newRow][(row-1) - r] = '.';  // Filling with empty space if stack is empty
                            }
                            else{
                                rotatedBox[newRow][(row-1) - r] = stack.pop();   // Filling with stone from stack
                            }
                        }
                    }
                }

                // If a stone (#) is encountered, pushing it onto the stack
                else if(box[r][c] == '#'){
                    stack.push('#');
                }
            }

            // Handling remaining cells when no more obstacles (*) are found
            for(int newRow=col-1;newRow>=0;newRow--){
                if(rotatedBox[newRow][(row-1) - r] == '*'){   
                    break;
                }
                else{
                    if(stack.isEmpty()){
                        rotatedBox[newRow][(row-1) - r] = '.';
                    }
                    else{
                        rotatedBox[newRow][(row-1) - r] = stack.pop();
                    }
                }
                    
            }
            
        }

        return rotatedBox;
    }
}