public class IDEKUtils {
    /**
     * <h2>Overview:</h2>
     * This Method Sorts An ArrayList Based On The Digits Of Pi.
     * For Example, Any Threes Will Be First, Then Ones, As They Occur In The Constant.
     * This Method Is Primarily Used For A Single Thing, But Can Be Applied To Basically Any
     * ArrayList That Only Has Integers. Doubles Are Not Allowed, Neither Other Numbers.
     * Remember, Pi Only Contains Numbers, Not Extra Decimal Points Or The Letter L.
     * <h2>Functionality:</h2>
     * When Thinking Of This, It Is Best To Remember These Numbers: 3.1415926535897. This
     * Is A Version Of Pi With Every Single Base 10 Number Besides Zero. I Choose To Ignore Zero
     * Because Of A Previous Rule Basically Making It Useless. Here, We Can See The Hierarchy Of
     * Numbers: 3, 1, 4, 5, 9, 2, 6, 8, 7.
     * <h2>Examples:</h2>
     * The List [4, 2, 1, 5, 4, 3, 4, 9, 6] Will Become [3, 1, 4, 4, 4, 5, 9, 2, 6]. There Is Also
     * A Version Of This Function That Eliminates Duplicate Nums. That Is {@code sortToPiLoss}.
     * @param originalList The Original List Of Numbers, Unsorted.
     * @return A List Of Numbers That Have Been Sorted.
     * @see #sortToPiLoss
     */
    public ArrayList<Integer> sortToPi(ArrayList<Integer> originalList) {
        ArrayList<Integer> tempList = new ArrayList<>();
        for(int i = 0; i < originalList.size(); i++) {
            if(originalList.get(i) == 3) {
                tempList.add(originalList.get(i));
            }
        }
        for(int i = 0; i < originalList.size(); i++) {
            if(originalList.get(i) == 1) {
                tempList.add(originalList.get(i));
            }
        }
        for(int i = 0; i < originalList.size(); i++) {
            if(originalList.get(i) == 4) {
                tempList.add(originalList.get(i));
            }
        }
        for(int i = 0; i < originalList.size(); i++) {
            if(originalList.get(i) == 5) {
                tempList.add(originalList.get(i));
            }
        }
        for(int i = 0; i < originalList.size(); i++) {
            if(originalList.get(i) == 9) {
                tempList.add(originalList.get(i));
            }
        }
        for(int i = 0; i < originalList.size(); i++) {
            if(originalList.get(i) == 2) {
                tempList.add(originalList.get(i));
            }
        }
        for(int i = 0; i < originalList.size(); i++) {
            if(originalList.get(i) == 6) {
                tempList.add(originalList.get(i));
            }
        }
        for(int i = 0; i < originalList.size(); i++) {
            if(originalList.get(i) == 8) {
                tempList.add(originalList.get(i));
            }
        }
        for(int i = 0; i < originalList.size(); i++) {
            if(originalList.get(i) == 7) {
                tempList.add(originalList.get(i));
            }
        }
        return tempList;
    }
    /**
     * <h2>Overview:</h2>
     * This Function Acts Exactly Like The {@code sortToPi}, Only It Removes Any Duplicate Values From The
     * Original. It Is Recommended To Read About How {@code sortToPi} Works Before This, Since This One
     * Builds Off Of That One.
     * <h2>Example:</h2>
     * The List [6, 2, 8, 4, 4, 1, 9] Will Turn Into [1, 4, 9, 2, 6, 8], Removing The Duplicate 4. Pretty
     * Self Explanatory.
     * @param originalList The Original List In Its Unsorted Form
     * @return The Sorted Version Of The List
     * @see #sortToPi
     */
    public ArrayList<Integer> sortToPiLoss(ArrayList<Integer> originalList) {
        ArrayList<Integer> tempList = new ArrayList<>();
        for(int i = 0; i < originalList.size(); i++) {
            if(originalList.get(i) == 3) {
                tempList.add(originalList.get(i));
                break;
            }
        }
        for(int i = 0; i < originalList.size(); i++) {
            if(originalList.get(i) == 1) {
                tempList.add(originalList.get(i));
                break;
            }
        }
        for(int i = 0; i < originalList.size(); i++) {
            if(originalList.get(i) == 4) {
                tempList.add(originalList.get(i));
                break;
            }
        }
        for(int i = 0; i < originalList.size(); i++) {
            if(originalList.get(i) == 5) {
                tempList.add(originalList.get(i));
                break;
            }
        }
        for(int i = 0; i < originalList.size(); i++) {
            if(originalList.get(i) == 9) {
                tempList.add(originalList.get(i));
                break;
            }
        }
        for(int i = 0; i < originalList.size(); i++) {
            if(originalList.get(i) == 2) {
                tempList.add(originalList.get(i));
                break;
            }
        }
        for(int i = 0; i < originalList.size(); i++) {
            if(originalList.get(i) == 6) {
                tempList.add(originalList.get(i));
                break;
            }
        }
        for(int i = 0; i < originalList.size(); i++) {
            if(originalList.get(i) == 8) {
                tempList.add(originalList.get(i));
                break;
            }
        }
        for(int i = 0; i < originalList.size(); i++) {
            if(originalList.get(i) == 7) {
                tempList.add(originalList.get(i));
                break;
            }
        }
        return tempList;
    }
    /**
     * <h2>Overview:</h2>
     * This Method Sorts An ArrayList Based On The Digits Of E.
     * For Example, Any Twos Will Be First, Then Sevens, As They Occur In The Constant.
     * This Method Is Primarily Used For A Single Thing, But Can Be Applied To Basically Any
     * ArrayList That Only Has Integers. Doubles Are Not Allowed, Neither Other Numbers.
     * Remember, E Only Contains Numbers, Not Extra Decimal Points Or The Letter L.
     * <h2>Functionality:</h2>
     * When Thinking Of This, It Is Best To Remember These Numbers: 2.71828182845904523536. This
     * Is A Version Of E With Every Single Base 10 Number. I Choose To Ignore Zero
     * Because Of A Previous Rule Basically Making It Useless. Here, We Can See The Hierarchy Of
     * Numbers: 2, 7, 1, 8, 4, 5, 9, 3, 6.
     * <h2>Examples:</h2>
     * The List [4, 2, 1, 5, 4, 3, 4, 9, 6] Will Become [2, 1, 4, 4, 4, 5, 9, 3, 6]. There Is Also
     * A Version Of This Function That Eliminates Duplicate Nums. That Is {@code sortToELoss}.
     * @param originalList The Original List Of Numbers, Unsorted.
     * @return A List Of Numbers That Have Been Sorted.
     * @see #sortToELoss
     */
    public static ArrayList<Integer> sortToE(ArrayList<Integer> originalList) {
        ArrayList<Integer> tempList = new ArrayList<>();
        for(int i = 0; i < originalList.size(); i++) {
            if(originalList.get(i) == 2) {
                tempList.add(originalList.get(i));
            }
        }
        for(int i = 0; i < originalList.size(); i++) {
            if(originalList.get(i) == 7) {
                tempList.add(originalList.get(i));
            }
        }
        for(int i = 0; i < originalList.size(); i++) {
            if(originalList.get(i) == 1) {
                tempList.add(originalList.get(i));
            }
        }
        for(int i = 0; i < originalList.size(); i++) {
            if(originalList.get(i) == 8) {
                tempList.add(originalList.get(i));
            }
        }
        for(int i = 0; i < originalList.size(); i++) {
            if(originalList.get(i) == 4) {
                tempList.add(originalList.get(i));
            }
        }
        for(int i = 0; i < originalList.size(); i++) {
            if(originalList.get(i) == 5) {
                tempList.add(originalList.get(i));
            }
        }
        for(int i = 0; i < originalList.size(); i++) {
            if(originalList.get(i) == 9) {
                tempList.add(originalList.get(i));
            }
        }
        for(int i = 0; i < originalList.size(); i++) {
            if(originalList.get(i) == 3) {
                tempList.add(originalList.get(i));
            }
        }
        for(int i = 0; i < originalList.size(); i++) {
            if(originalList.get(i) == 6) {
                tempList.add(originalList.get(i));
            }
        }
        return tempList;
    }
    /**
     * <h2>Overview:</h2>
     * This Function Acts Exactly Like The {@code sortToE}, Only It Removes Any Duplicate Values From The
     * Original. It Is Recommended To Read About How {@code sortToE} Works Before This, Since This One
     * Builds Off Of That One.
     * <h2>Example:</h2>
     * The List [6, 2, 8, 4, 4, 1, 9] Will Turn Into [2, 1, 8, 4, 9, 6], Removing The Duplicate 4. Pretty
     * Self Explanatory.
     * @param originalList The Original List In Its Unsorted Form
     * @return The Sorted Version Of The List
     * @see #sortToE
     */
    public static ArrayList<Integer> sortToELoss(ArrayList<Integer> originalList) {
        ArrayList<Integer> tempList = new ArrayList<>();
        for(int i = 0; i < originalList.size(); i++) {
            if(originalList.get(i) == 2) {
                tempList.add(originalList.get(i));
                break;
            }
        }
        for(int i = 0; i < originalList.size(); i++) {
            if(originalList.get(i) == 7) {
                tempList.add(originalList.get(i));
                break;
            }
        }
        for(int i = 0; i < originalList.size(); i++) {
            if(originalList.get(i) == 1) {
                tempList.add(originalList.get(i));
                break;
            }
        }
        for(int i = 0; i < originalList.size(); i++) {
            if(originalList.get(i) == 8) {
                tempList.add(originalList.get(i));
                break;
            }
        }
        for(int i = 0; i < originalList.size(); i++) {
            if(originalList.get(i) == 4) {
                tempList.add(originalList.get(i));
                break;
            }
        }
        for(int i = 0; i < originalList.size(); i++) {
            if(originalList.get(i) == 5) {
                tempList.add(originalList.get(i));
                break;
            }
        }
        for(int i = 0; i < originalList.size(); i++) {
            if(originalList.get(i) == 9) {
                tempList.add(originalList.get(i));
                break;
            }
        }
        for(int i = 0; i < originalList.size(); i++) {
            if(originalList.get(i) == 3) {
                tempList.add(originalList.get(i));
                break;
            }
        }
        for(int i = 0; i < originalList.size(); i++) {
            if(originalList.get(i) == 6) {
                tempList.add(originalList.get(i));
                break;
            }
        }
        return tempList;
    }
    /**
     * <h2>Overview:</h2>
     * This Method Returns True If And Only If The List Contains Every Single One Of First 30 Digits
     * Of E. Even If A List Contains More Than That, Such As An Extra 4, It Will Still Count. You Can
     * Choose {@code contains30OfEX} If You Need That.
     * <h2>Functionality:</h2>
     * If Given The List [2, 5, 2, 7, 1, 3, 2, 7], It Will Return False. However, The List
     * [2, 7, 1, 8, 2, 8, 1, 8, 2, 8, 4, 5, 9, 0, 4, 5, 2, 3, 5, 3, 6, 0, 2, 8, 7, 4, 7, 1, 3, 5] Will
     * Return True Because Every Number From 2.71828182845904523536028747135 Is Here.
     * <h2>Modification:</h2>
     * This Function Can Be Modified To Fit Any Number Of Digits. Just Change The Numbers At The Bottom.
     * @param originalList
     * @return
     */
    public static boolean contains30OfE(ArrayList<Integer> originalList) {
        int[] amountsOfNums = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for(int i = 0; i < originalList.size(); i++) {
            if(originalList.get(i) == 0) {
                amountsOfNums[0]++;
            }
        }
        for(int i = 0; i < originalList.size(); i++) {
            if(originalList.get(i) == 1) {
                amountsOfNums[1]++;
            }
        }
        for(int i = 0; i < originalList.size(); i++) {
            if(originalList.get(i) == 2) {
                amountsOfNums[2]++;
            }
        }
        for(int i = 0; i < originalList.size(); i++) {
            if(originalList.get(i) == 3) {
                amountsOfNums[3]++;
            }
        }
        for(int i = 0; i < originalList.size(); i++) {
            if(originalList.get(i) == 4) {
                amountsOfNums[4]++;
            }
        }
        for(int i = 0; i < originalList.size(); i++) {
            if(originalList.get(i) == 5) {
                amountsOfNums[5]++;
            }
        }
        for(int i = 0; i < originalList.size(); i++) {
            if(originalList.get(i) == 6) {
                amountsOfNums[6]++;
            }
        }
        for(int i = 0; i < originalList.size(); i++) {
            if(originalList.get(i) == 7) {
                amountsOfNums[7]++;
            }
        }
        for(int i = 0; i < originalList.size(); i++) {
            if(originalList.get(i) == 8) {
                amountsOfNums[8]++;
            }
        }
        for(int i = 0; i < originalList.size(); i++) {
            if(originalList.get(i) == 9) {
                amountsOfNums[9]++;
            }
        }
        if(amountsOfNums[0] >= 2 && amountsOfNums[1] >= 3 && amountsOfNums[2] >= 5 
        && amountsOfNums[3] >= 3 && amountsOfNums[4] >= 3 && amountsOfNums[5] >= 4 
        && amountsOfNums[6] >= 1 && amountsOfNums[7] >= 3 && amountsOfNums[8] >= 5 
        && amountsOfNums[9] >= 1) {
            return true;
        }
        return false;
    }
}
