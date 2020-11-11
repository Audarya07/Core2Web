class TextEditor {

	String editorName;
	String creator;

	TextEditor(String editorName, String creator) {

		this.editorName = editorName;
		this.creator = creator;
	}

	void details() {
		System.out.println("Creator: " + editorName + " | Creator: " + creator);
	}
}

class PunchingCard {
	TextEditor vim = new TextEditor("Vim", "Bram Moolenar");
	TextEditor atom = new TextEditor("Atom", "Github");
	TextEditor sublime = new TextEditor("Sublime", "Jon Skinner");

	void editorInfo() {
		vim.details();
		atom.details();
		sublime.details();
	}

	public static void main(String[] args) {
		
		PunchingCard pc = new PunchingCard();
		pc.editorInfo();
	}
}