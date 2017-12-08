package com.learn.enumdemo.harshi.in;

public enum EnumInstance{
POWER("power is on"),
START("start is over"),
STOP("stop the game"),
RESUME("resume power"),
PUZZLE("i am puzzled"),
LINK("link is power"),
SWING("swing is swag");

private String link;

EnumInstance(String url) {
	this.link=url;
}

public String getLink() {
	return link;
}

}
