package com.beepbot.dto;

import java.util.List;

public class News {

	private List<Object> source;
	private List<Object> title;
	private List<Object> content;

	/**
	 * @return the source
	 */
	public List<Object> getSource() {
		return source;
	}

	/**
	 * @param source the source to set
	 */
	public void setSource(List<Object> source) {
		this.source = source;
	}

	/**
	 * @return the title
	 */
	public List<Object> getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(List<Object> title) {
		this.title = title;
	}

	/**
	 * @return the content
	 */
	public List<Object> getContent() {
		return content;
	}

	/**
	 * @param content the content to set
	 */
	public void setContent(List<Object> content) {
		this.content = content;
	}
}
