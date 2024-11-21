package LowLevelDesign.Creational.Prototype;

public class ReportDocument implements DocumentPrototype{
    private String title;
    private String content;
    private String footer;

    public ReportDocument(String title, String content, String footer) {
        this.title = title;
        this.content = content;
        this.footer = footer;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setFooter(String footer) {
        this.footer = footer;
    }

    @Override
    public DocumentPrototype clone() {
        System.out.println("Cloning ReportDocument...");
        return new ReportDocument(title, content, footer);
    }

    @Override
    public String toString() {
        return "ReportDocument [Title=" + title + ", Content=" + content + ", Footer=" + footer + "]";
    }
}
