package kr.or.ddit.board.model;

import java.util.Date;

public class BoardVo {
	private String title;		// 글제목
	private String content;		// 글내용
	private String userId;		// 작성자 아이디
	private String alias;		// 작성자별칭
	private Date regDt;			// 글 등록일지
	
	public BoardVo() {}
	
	public BoardVo(String title, String content, String userId, String alias,Date regDt) {
		this.title = title;
		this.content = content;
		this.userId = userId;
		this.alias = alias;
		this.regDt = regDt;
	}

	@Override
	public String toString() {
		return "BoardVo [title=" + title + ", content=" + content + ", userId="
				+ userId + ", alias=" + alias + ", regDt=" + regDt + "]";
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	public Date getRegDt() {
		return regDt;
	}
	public void setRegDt(Date regDt) {
		this.regDt = regDt;
	}
}
