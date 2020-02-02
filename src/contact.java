public class contact {
    
    private Integer cid;
    private String fnn;
    private String lnn;
    private String groupc;
    private String phone;
    private String email;
    private String address;
    private byte[] pccn;
    private int uid;

    public contact() {}
    
    

    public contact(Integer cid, String fnn, String lnn, String groupc, String phone, String email, String address, byte[] pccn, int uid) {
        this.cid = cid;
        this.fnn = fnn;
        this.lnn = lnn;
        this.groupc = groupc;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.pccn = pccn;
        this.uid = uid;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getFnn() {
        return fnn;
    }

    public void setFnn(String fnn) {
        this.fnn = fnn;
    }

    public String getLnn() {
        return lnn;
    }

    public void setLnn(String lnn) {
        this.lnn = lnn;
    }

    public String getGroupc() {
        return groupc;
    }

    public void setGroupc(String groupc) {
        this.groupc = groupc;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public byte[] getPccn() {
        return pccn;
    }

    public void setPccn(byte[] pccn) {
        this.pccn = pccn;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }
    
    
}
