package com.example.bangdream;

import java.io.Serializable;


enum BAND{
    POPPYN_PARTY,AFTER_GLOW
}

enum ASTROLOGIAN{
    ARIES,TAURUS,GEMINI,CANCER,LEO,VIRGO,LIBRA,SCORPIO,SAGITTARIUS,CAPRICORN,AQUARIUS,PISCES
}

public class cMember implements Serializable {

    private int _id;
    private String _name;
    private String _JapaneseName;
    private String _imgUrl;
    private String _SquareImg;
    private BAND _band;
    private String _school;
    private String _YearSchool;
    private String _Romanji;
    private String _cv;
    private String _Birthday;
    private String _foodLike;
    private String _foodDislike;
    private ASTROLOGIAN _astrologian;
    private String _instrument;
    private String _description;

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public String get_JapaneseName() {
        return _JapaneseName;
    }

    public void set_JapaneseName(String _JapaneseName) {
        this._JapaneseName = _JapaneseName;
    }

    public String get_imgUrl() {
        return _imgUrl;
    }

    public void set_imgUrl(String _imgUrl) {
        this._imgUrl = _imgUrl;
    }

    public String get_SquareImg() {
        return _SquareImg;
    }

    public void set_SquareImg(String _SquareImg) {
        this._SquareImg = _SquareImg;
    }

    public BAND get_band() {
        return _band;
    }

    public void set_band(BAND _band) {
        this._band = _band;
    }

    public String get_school() {
        return _school;
    }

    public void set_school(String _school) {
        this._school = _school;
    }

    public String get_YearSchool() {
        return _YearSchool;
    }

    public void set_YearSchool(String _YearSchool) {
        this._YearSchool = _YearSchool;
    }

    public String get_Romanji() {
        return _Romanji;
    }

    public void set_Romanji(String _Romanji) {
        this._Romanji = _Romanji;
    }

    public String get_cv() {
        return _cv;
    }

    public void set_cv(String _cv) {
        this._cv = _cv;
    }

    public String get_Birthday() {
        return _Birthday;
    }

    public void set_Birthday(String _Birthday) {
        this._Birthday = _Birthday;
    }

    public String get_foodLike() {
        return _foodLike;
    }

    public void set_foodLike(String _foodLike) {
        this._foodLike = _foodLike;
    }

    public String get_foodDislike() {
        return _foodDislike;
    }

    public void set_foodDislike(String _foodDislike) {
        this._foodDislike = _foodDislike;
    }

    public ASTROLOGIAN get_astrologian() {
        return _astrologian;
    }

    public void set_astrologian(ASTROLOGIAN _astrologian) {
        this._astrologian = _astrologian;
    }

    public String get_instrument() {
        return _instrument;
    }

    public void set_instrument(String _instrument) {
        this._instrument = _instrument;
    }

    public String get_description() {
        return _description;
    }

    public void set_description(String _description) {
        this._description = _description;
    }

    public cMember(int _id, String _name, String _JapaneseName, String _imgUrl, String _SquareImg, BAND _band, String _school, String _YearSchool, String _Romanji, String _cv, String _Birthday, String _foodLike, String _foodDislike, ASTROLOGIAN _astrologian, String _instrument, String _description) {
        this._id = _id;
        this._name = _name;
        this._JapaneseName = _JapaneseName;
        this._imgUrl = _imgUrl;
        this._SquareImg = _SquareImg;
        this._band = _band;
        this._school = _school;
        this._YearSchool = _YearSchool;
        this._Romanji = _Romanji;
        this._cv = _cv;
        this._Birthday = _Birthday;
        this._foodLike = _foodLike;
        this._foodDislike = _foodDislike;
        this._astrologian = _astrologian;
        this._instrument = _instrument;
        this._description = _description;
    }
}
