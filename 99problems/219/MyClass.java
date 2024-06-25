class Files {
    String fileName;
    String fileExtension;
    String content;
    String parentFolder;
    
    public Files(String fileName, String fileExtension, String content, String parentFolder) {
        this.fileName = fileName;
        this.fileExtension = validateExtension(fileExtension);
        this.content = content;
        this.parentFolder = parentFolder;
    }

    private String validateExtension(String extension) {
        switch (extension) {
            case ".word":
            case ".png":
            case ".mp4":
            case ".pdf":
                return extension;
            default:
                return ".txt";
        }
    }

    public String getLifetimeBandwidthSize() {
        double size = this.content.length() * 25;
        if (size < 1000) {
            return (int)size + "MB";
        } else {
            return String.format("%.3fGB", size / 1000);
        }
    }

    public String prependContent(String data) {
        this.content = data + this.content;
        return this.content;
    }

    public String addContent(String data, int position) {
        this.content = this.content.substring(0, position) + data + this.content.substring(position, this.content.length());
        return this.content;
    }

    public String showFileLocation() {
        return this.parentFolder + " > " + this.fileName + this.fileExtension;
    }
}

class MyClass {
    public static void main(String[] args) {
        Files assignment = new Files("assignment", ".word", "ABCDEFGH", "homework");
        System.out.println(assignment.getLifetimeBandwidthSize()); // --> 200MB
        System.out.println(assignment.prependContent("MMM"));
        System.out.println(assignment.addContent("hello world", 5));
        System.out.println(assignment.showFileLocation()); // --> homework > assignment.word
    
        Files blade = new Files("blade", ".txt", "bg-primary text-white m-0 p-0 d-flex justify-content-center", "view");
        System.out.println(blade.getLifetimeBandwidthSize()); // --> 1.475GB
        System.out.println(blade.addContent("font-weight-bold ", 11));
        System.out.println(blade.showFileLocation()); // --> view > blade.txt
    }
}
