import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.awt.print.*;
import  java.awt.datatransfer.*;
public class TextEditor extends Frame
{
	String path;
	TextArea ta;
	MenuBar mb;
        Menu mFile,mEdit,mFormat,mHelp,mRecent;
	MenuItem mNew,mOpen,mSave,mSaveAs,mPrint,mPageSetup,mExit;
	MenuItem mCut,mCopy,mPaste,mSelectAll,mDelete,mDate,mFind;
	MenuItem mFont,mColor,mBold,mItalic,mUnderline;
	public TextEditor()
	{
		this.setSize(600,400);
		this.setLayout(new BorderLayout());
		this.addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent e){System.exit(0);}});
		ta=new TextArea();
		this.add(ta);
		Font f=new Font("Arial",Font.PLAIN,16);
		ta.setFont(f);
		mb=new MenuBar();
		mFile=new Menu("File");
		//mNew,mOpen,mSave,mSaveAs,mPrint,mPageSetup,mExit;
		mNew=new MenuItem("New");
		mFile.add(mNew);
		mOpen=new MenuItem("Open");
		mFile.add(mOpen);
		mFile.addSeparator();
		mSave=new MenuItem("Save");
		mFile.add(mSave);
		mSaveAs=new MenuItem("Save as");
		mFile.add(mSaveAs);
		mFile.addSeparator();
		mPrint=new MenuItem("Print");
		mFile.add(mPrint);
		mPageSetup=new MenuItem("Page Setup");
		mFile.add(mPageSetup);
		mFile.addSeparator();
		mRecent=new Menu("Recent");
		mFile.add(mRecent);
		mFile.addSeparator();
		mExit=new MenuItem("Exit");
		mFile.add(mExit);
		mEdit=new Menu("Edit");
		//mCut,mCopy,mPaste,mSelectAll,mDelete,mDate,mFind;
		mCut=new MenuItem("Cut");
		mEdit.add(mCut);
		mCopy=new MenuItem("Copy");
		mEdit.add(mCopy);
		mPaste=new MenuItem("Paste");
		mEdit.add(mPaste);
		mEdit.addSeparator();
		mSelectAll=new MenuItem("Select all");
		mEdit.add(mSelectAll);
		mEdit.addSeparator();
		mDelete=new MenuItem("Delete");
		mEdit.add(mDelete);
		mEdit.addSeparator();
		mDate=new MenuItem("Date");
		mEdit.add(mDate);
		mEdit.addSeparator();
		mFind=new MenuItem("Find");
		mEdit.add(mFind);

		mFormat=new Menu("Format");
		//mFont,mColor,mBold,mItalic,mUnderline;
		mFont=new MenuItem("Font");
		mFormat.add(mFont);
		mFormat.addSeparator();
		mColor=new MenuItem("Color");
		mFormat.add(mColor);
		mFormat.addSeparator();
		mBold=new MenuItem("Bold");
		mFormat.add(mBold);
		mItalic=new MenuItem("Italic");
		mFormat.add(mItalic);
		mUnderline=new MenuItem("Underline");
		mFormat.add(mUnderline);

		mHelp=new Menu("Help");
		mb.add(mFile);mb.add(mEdit);mb.add(mFormat);
		mb.add(mHelp);
		this.setMenuBar(mb);
		mExit.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){System.exit(0);}});
		mOpen.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){open_Click();}});
		mFind.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){find_Click();}});
		mFont.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){font_Click();}});
		mColor.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){color_Click();}});
		mSelectAll.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){selectAll_Click();}});
		mSave.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){save_Click();}});
		mPrint.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){print_Click();}});
		mPageSetup.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){pageSetup_Click();}});
		mCut.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){cut_Click();}});
		mCopy.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){copy_Click();}});
		mPaste.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){paste_Click();}});
	}
	void paste_Click()
	{
		Transferable t = Toolkit.getDefaultToolkit().getSystemClipboard().getContents(null);
        try {
            if (t != null && t.isDataFlavorSupported(DataFlavor.stringFlavor))
            {
                String text = (String)t.getTransferData(DataFlavor.stringFlavor);
               ta.setText(text);
		 	}
		}catch(Exception ee){}

	}
	void copy_Click()
	{
			StringSelection ss = new StringSelection(ta.getSelectedText());
	        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
	        //ta.setSelectedText("");

	}
	void cut_Click()
	{
		StringSelection ss = new StringSelection(ta.getSelectedText());
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
        //ta.setSelectedText("");

	}
	void pageSetup_Click()
	{
		PrinterJob pj = PrinterJob.getPrinterJob();
       PageFormat pf = pj.defaultPage();
    	pf.setOrientation(PageFormat.LANDSCAPE);
       pf = pj.pageDialog(pf);
	}
	void print_Click()
	{
		PrinterJob pj = PrinterJob.getPrinterJob();
		    PageFormat pf = pj.defaultPage();
		    pj.setPrintable(new MyPrint(), pf);
		    try {
		        if (pj.printDialog()) {
		            pj.print();
		        }
		    } catch (PrinterException e) {
		    }

	}
	void save_Click()
	{
		String save=ta.getText();
		FileDialog fd=new FileDialog(this,"Save as...",FileDialog.SAVE);
		fd.setVisible(true);
		try{
				FileWriter fr=new FileWriter(fd.getDirectory() +fd.getFile() );
				fr.write(ta.getText());
				fr.close();
			}catch(Exception e){}
	}

	void selectAll_Click()
	{
		ta.selectAll();
	}

	void color_Click()
	{
		colorDialog cod=new colorDialog(this);
		cod.setVisible(true);
		ta.setForeground(cod.getColor());
	}

	void font_Click()
	{
		fontDialog fod=new fontDialog(this);
		fod.setVisible(true);
		Font f=fod.getMyFont();
		ta.setFont(f);
	}

	void find_Click()
	{
		FindDialog fnd=new FindDialog(this);
		fnd.setVisible(true);
		String s=ta.getText();
		String f=fnd.txtFind.getText();
		int pos=s.indexOf(f);
		ta.select(pos,pos+f.length());

	}
	void open_Click()
	{
		fileDialog fd=new fileDialog(this);
		fd.setTitle("Select a file.......");
		fd.setVisible(true);
		path=fd.getDirectory()+ fd.getFile();
		try{
			if(! path.equals("") && path!=null)
			{
				FileReader fr=new FileReader(path);
				BufferedReader bfr=new BufferedReader(fr);
				String data=bfr.readLine();
				String str="";
				while(data!=null)
				{
						str=str+data + "\n";
						data=bfr.readLine();
				}
				fr.close();
				ta.setText(str);
			}
	}catch(Exception e){}
	}
	public static void main(String[] ar)
	{
		(new TextEditor()).setVisible(true);
	}
}
class MyPrint implements Printable
{
		public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException
		{

			return 0;
		}
}