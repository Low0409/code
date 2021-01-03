import java.io.File;
import java.io.IOException;

class CreateFile {
  public static void main(String args[]) {
    File newfile = new File("C:\\Users\\81908\\OneDrive\\デスクトップ\\Java02\\Ex12\\anser\\create.txt");

    try {
      if (newfile.createNewFile()) {
        System.out.println("ファイルの作成に成功しました");
      } else {
        System.out.println("ファイルの作成に失敗しました");
      }
    } catch (IOException e) {
      System.out.println(e);
    }
  }
}