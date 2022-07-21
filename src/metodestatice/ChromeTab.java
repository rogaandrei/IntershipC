package metodestatice;

public class ChromeTab {
    static String history="";
    String currentSiteName;

    public ChromeTab(String currentSiteName) {
        super();
        this.currentSiteName = currentSiteName;
    }
    public static void main(String[] args) {
        ChromeTab tab1=new ChromeTab("Youtube");
        ChromeTab tab2=new ChromeTab("Google");
        ChromeTab tab3=new ChromeTab("Translate");
        tab1.changeCurrentSite("ole");
        tab2.changeCurrentSite("ole");
        tab3.changeCurrentSite("ole");
        System.out.println(tab1);
        System.out.println(tab2);
        System.out.println(tab3);
        System.out.println(ChromeTab.history);

    }
    public void changeCurrentSite(String newSite) {
        currentSiteName=newSite;
        history+=" " +newSite+ " ";
    }
    @Override
    public String toString() {
        return "ChromeTab [currentSiteName=" + currentSiteName + ",history=" + history + "]";
    }

}
