public class PhoneList {

    public static void main(String[] args) {

        Contact[] friends = new Contact[6];

        friends[0] = new Contact("Danielle" , "Shevchuk", "01234566");
        friends[1] = new Contact("Marcus", "Vieira", "245875434");
        friends[2] = new Contact("Or", "Gindi", "463463564");
        friends[3] = new Contact("Alex", "Kremiansky", "5746756");
        friends[4] = new Contact("Oksana", "Shevchuk", "03498442");
        friends[5] = new Contact("Yuri", "Shevchuk", "468980987");

        Sorting.selectionSort(friends);
        for (Contact friend: friends) {
            System.out.println(friend);
        }

        System.out.println();

        Sorting.insertionSort(friends);
        for (Contact friend: friends) {
            System.out.println(friend);
        }
    }
}
