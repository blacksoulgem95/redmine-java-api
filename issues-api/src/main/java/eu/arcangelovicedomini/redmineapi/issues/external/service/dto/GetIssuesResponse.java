package eu.arcangelovicedomini.redmineapi.issues.external.service.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import eu.arcangelovicedomini.redmineapi.common.util.Utils;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class GetIssuesResponse {

	public IssueDTO[] issues;
	
	@XmlAttribute(name = "total_count")
	public Long totalCount;
	public Integer offset;
	public Integer limit;
	
	@Override
	public String toString() {
		return Utils.toJson(this);
	}
}
