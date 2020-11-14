package com.gzst.shopping.utils;

import java.util.List;

/**
 * 分页结果类
 * @param <E>
 */
public class PageResult<E> {

    private Long totals;
    private List<E> rows;

    public PageResult() {
    }
    public PageResult(Long totals, List<E> rows) {
        this.totals = totals;
        this.rows = rows;
    }
    public Long getTotals() {
        return totals;
    }

    public void setTotals(Long totals) {
        this.totals = totals;
    }

    public List<E> getRows() {
        return rows;
    }

    public void setRows(List<E> rows) {
        this.rows = rows;
    }


}