
public class Fila {
	public static int tam = 3
			;
	public static int vFila[] = new int[tam];
	public static int iSPos = 0;
	public static int iRPos = 0;
	public static boolean bQueueFull = false;

	public static int size() {
		if (iSPos >= iRPos && !bQueueFull)
			return iSPos - iRPos;
		else
			return iSPos + vFila.length - iRPos;
	}

	public static int front() {
		return vFila[iRPos];
	}

	public static boolean isOver() {
		if (iSPos == iRPos && bQueueFull)
			return true;
		return false;
	}

	public static void adiciona(int iC) {
		vFila[iSPos++] = iC;
		if (iSPos >= vFila.length)
			iSPos = 0;
		if (iSPos == iRPos)
			bQueueFull = true;
	}

	public static int remove() {
		int iIndice = iRPos++;
		if (iRPos >= vFila.length)
			iRPos = 0;
		bQueueFull = false;
		return vFila[iIndice];
	}

	public static String print(int i) {
		String str = "";
		for (int s = i; s < vFila.length; s++) {
			str += vFila[s];
		}
		String str1 = "";
		for (int s = i - iSPos; s < i-iSPos; s++) {
			str1 += vFila[s];
		}
		return str+str1;
	}

}
