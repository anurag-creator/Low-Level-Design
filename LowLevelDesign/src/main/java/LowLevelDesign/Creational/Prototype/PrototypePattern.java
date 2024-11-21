package LowLevelDesign.Creational.Prototype;

public class PrototypePattern {
    public static void main(String[] args) {
        // Create an initial document (prototype)
        ReportDocument originalReport = new ReportDocument(
                "Monthly Report",
                "This is the content of the monthly report.",
                "Confidential - For Internal Use Only"
        );

        System.out.println("Original Document: " + originalReport);

        // Clone the original document
        ReportDocument clonedReport = (ReportDocument) originalReport.clone();

        // Modify the cloned document
        clonedReport.setTitle("Cloned Monthly Report");
        clonedReport.setFooter("Public Use Allowed");

        // Display both documents
        System.out.println("Modified Cloned Document: " + clonedReport);
        System.out.println("Original Document remains unchanged: " + originalReport);
    }
}
