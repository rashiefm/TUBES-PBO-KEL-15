/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubespbo;

/**
 *
 * @author Rashief
 */
public class Orang {
    private String jenisKelamin;
    private String nama;
    private String umur;
	private String tempatLahir;
	private String status;

	public Orang (String jenisKelamin,String nama,String umur,String tempatLahir,String status){
		this.jenisKelamin = jenisKelamin;
		this.nama = nama;
                this.umur = umur;
		this.tempatLahir = tempatLahir;
		this.status = status;
	}

	public void setJenisKelamin(String jenisKelamin){
		this.jenisKelamin = jenisKelamin;
	}
	public void setUmur(String umur){
		this.umur = umur;
	}
	public void setTempatLahir(String tempatLahir){
		this.tempatLahir = tempatLahir;
	}
	public void setStatus(String status){
		this.status = status;
	}
        public void setNama(String nama){
            this.nama = nama;
        }
	public String getJenisKelamin(){
		return jenisKelamin;
	}
        public String getNama(){
            return nama;
        }
	public String getUmur(){
		return umur;
	}
	public String getTempatLahir(){
		return tempatLahir;
	}
	public String getStatus(){
		return status;
        }
}
