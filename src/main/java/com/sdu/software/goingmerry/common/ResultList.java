package com.sdu.software.goingmerry.common;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ResultList<T> implements Serializable {

	private static final long serialVersionUID = 810963284945343746L;

	private int size;

	private int page;

	private int total;

	private boolean more;

	private List<T> data = new ArrayList<T>();

	public ResultList(int total, List<T> data) {
		this.total = total;
		if (data != null) {
			this.data = data;
		}
	}

	public ResultList(int total, T[] data) {
		
		this.total = total;
		this.data = null == data ? null : Arrays.asList(data);
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public boolean isMore() {
		return more;
	}

	public void setMore(boolean more) {
		this.more = more;
	}

	public List<T> getData() {

		if (null == data) {
			data = new ArrayList<T>();
		}
		return data;
	}

	public void setData(List<T> data) {
		
		if (data == null) {
			this.data = new ArrayList<T>();
		} else {
			this.data = data;
		}

		// total小于等于0才设置total
		if (total <= 0) {
			this.total = null == data ? 0 : data.size();
		}
	}

}
