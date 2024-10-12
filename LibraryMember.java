public class LibraryMember extends Person {
    private String membershipType;

    public LibraryMember(String name, String id, String membershipType) {
        super(name, id);
        this.membershipType = membershipType;
    }

    @Override
    public void displayInfo() {
        System.out.println("Library Member: " + name + " (ID: " + id + "), Membership: " + membershipType);
    }

    public String getMembershipType() {
        return membershipType;
    }

    public void setMembershipType(String membershipType) {
        this.membershipType = membershipType;
    }
}