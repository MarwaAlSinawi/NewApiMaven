package countrydb;

import java.util.Arrays;

public class LanguagesMain {
	Name name;
	String[] tld;
	String cca2;
	String ccn3;
	String cca3;
	String cioc;
	String independent;
	String status;
	boolean unMember;
	Currencies currencies;
	Idd idd;
	String[] capital;
	String[] altSpellings;
	String region;
	String subregion;
	Languages languages;
	Translations translations;
	float[] latlng;
	boolean landlocked;
	double area;
	Demonyms demonyms;
	String flag;
	Maps maps;
	int population;
	String fifa;
	Car car;
	String[] timezones;
	String[] continents;
	Flags flags;
	CoatOfArms coatOfArms;
	String startOfWeek;
	CapitalInfo capitalInfo;

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public String[] getTld() {
		return tld;
	}

	public void setTld(String[] tld) {
		this.tld = tld;
	}

	public String getCca2() {
		return cca2;
	}

	public void setCca2(String cca2) {
		this.cca2 = cca2;
	}

	public String getCcn3() {
		return ccn3;
	}

	public void setCcn3(String ccn3) {
		this.ccn3 = ccn3;
	}

	public String getCca3() {
		return cca3;
	}

	public void setCca3(String cca3) {
		this.cca3 = cca3;
	}

	public String getCioc() {
		return cioc;
	}

	public void setCioc(String cioc) {
		this.cioc = cioc;
	}

	public String isIndependent() {
		return independent;
	}

	public void setIndependent(String independent) {
		this.independent = independent;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public boolean isUnMember() {
		return unMember;
	}

	public void setUnMember(boolean unMember) {
		this.unMember = unMember;
	}

	public Currencies getCurrencies() {
		return currencies;
	}

	public void setCurrencies(Currencies currencies) {
		this.currencies = currencies;
	}

	public Idd getIdd() {
		return idd;
	}

	public void setIdd(Idd idd) {
		this.idd = idd;
	}

	public String[] getCapital() {
		return capital;
	}

	public void setCapital(String[] capital) {
		this.capital = capital;
	}

	public String[] getAltSpellings() {
		return altSpellings;
	}

	public void setAltSpellings(String[] altSpellings) {
		this.altSpellings = altSpellings;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getSubregion() {
		return subregion;
	}

	public void setSubregion(String subregion) {
		this.subregion = subregion;
	}

	public Languages getLanguages() {
		return languages;
	}

	public void setLanguages(Languages languages) {
		this.languages = languages;
	}

	public Translations getTranslations() {
		return translations;
	}

	public void setTranslations(Translations translations) {
		this.translations = translations;
	}

	public float[] getLatlng() {
		return latlng;
	}

	public void setLatlng(float[] latlng) {
		this.latlng = latlng;
	}

	public boolean isLandlocked() {
		return landlocked;
	}

	public void setLandlocked(boolean landlocked) {
		this.landlocked = landlocked;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public Demonyms getDemonyms() {
		return demonyms;
	}

	public void setDemonyms(Demonyms demonyms) {
		this.demonyms = demonyms;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public Maps getMaps() {
		return maps;
	}

	public void setMaps(Maps maps) {
		this.maps = maps;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public String getFifa() {
		return fifa;
	}

	public void setFifa(String fifa) {
		this.fifa = fifa;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public String[] getTimezones() {
		return timezones;
	}

	public void setTimezones(String[] timezones) {
		this.timezones = timezones;
	}

	public String[] getContinents() {
		return continents;
	}

	public void setContinents(String[] continents) {
		this.continents = continents;
	}

	public Flags getFlags() {
		return flags;
	}

	public void setFlags(Flags flags) {
		this.flags = flags;
	}

	public CoatOfArms getCoatOfArms() {
		return coatOfArms;
	}

	public void setCoatOfArms(CoatOfArms coatOfArms) {
		this.coatOfArms = coatOfArms;
	}

	public String getStartOfWeek() {
		return startOfWeek;
	}

	public void setStartOfWeek(String startOfWeek) {
		this.startOfWeek = startOfWeek;
	}

	public CapitalInfo getCapitalInfo() {
		return capitalInfo;
	}

	public void setCapitalInfo(CapitalInfo capitalInfo) {
		this.capitalInfo = capitalInfo;
	}

	@Override
	public String toString() {
		return "LanguagesMain [name=" + name + ", tld=" + Arrays.toString(tld) + ", cca2=" + cca2 + ", ccn3=" + ccn3
				+ ", cca3=" + cca3 + ", cioc=" + cioc + ", independent=" + independent + ", status=" + status
				+ ", unMember=" + unMember + ", currencies=" + currencies + ", idd=" + idd + ", capital="
				+ Arrays.toString(capital) + ", altSpellings=" + Arrays.toString(altSpellings) + ", region=" + region
				+ ", subregion=" + subregion + ", languages=" + languages + ", translations=" + translations
				+ ", latlng=" + Arrays.toString(latlng) + ", landlocked=" + landlocked + ", area=" + area
				+ ", demonyms=" + demonyms + ", flag=" + flag + ", maps=" + maps + ", population=" + population
				+ ", fifa=" + fifa + ", car=" + car + ", timezones=" + Arrays.toString(timezones) + ", continents="
				+ Arrays.toString(continents) + ", flags=" + flags + ", coatOfArms=" + coatOfArms + ", startOfWeek="
				+ startOfWeek + ", capitalInfo=" + capitalInfo + "]";
	}

}
