
package Class_Model;


public class ThongKe_Model {
    
    private String khachHang;
    private String banRa;
    private String muaVao;
    private float doanhThu;

    public ThongKe_Model() {
    }

    public ThongKe_Model(String khachHang, String banRa, String muaVao, float doanhThu) {
        this.khachHang = khachHang;
        this.banRa = banRa;
        this.muaVao = muaVao;
        this.doanhThu = doanhThu;
    }

    public String getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(String khachHang) {
        this.khachHang = khachHang;
    }

    public String getBanRa() {
        return banRa;
    }

    public void setBanRa(String banRa) {
        this.banRa = banRa;
    }

    public String getMuaVao() {
        return muaVao;
    }

    public void setMuaVao(String muaVao) {
        this.muaVao = muaVao;
    }

    public float getDoanhThu() {
        return doanhThu;
    }

    public void setDoanhThu(float doanhThu) {
        this.doanhThu = doanhThu;
    }
    
    
    
}
