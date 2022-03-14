
public class Stuff {

	public String  Item, Kategori, supply;
	public int itemId, stok, barangmasuk;
	
	public Stuff() {
		// TODO Auto-generated constructor stub
	}

	public Stuff(int itemId, String item, String kategori,int stok, int barangmasuk, String supply ) {
		super();
		this.itemId = itemId;
		this.Item = item;
		this.Kategori = kategori;
		this.stok = stok;
		this.barangmasuk = barangmasuk;
		this.supply = supply;
		
	}

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItem() {
		return Item;
	}

	public void setItem(String item) {
		Item = item;
	}

	public String getKategori() {
		return Kategori;
	}

	public void setKategori(String kategori) {
		Kategori = kategori;
	}

	public String getSupply() {
		return supply;
	}

	public void setSupply(String supply) {
		this.supply = supply;
	}

	public int getStok() {
		return stok;
	}

	public void setStok(int stok) {
		this.stok = stok;
	}

	public int getBarangmasuk() {
		return barangmasuk;
	}

	public void setBarangmasuk(int barangmasuk) {
		this.barangmasuk = barangmasuk;
	}

	
	
}
