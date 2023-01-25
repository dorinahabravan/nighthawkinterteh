package com.iucosoft.nighthawk_interteh_web_cms.dto.convertors;

import com.iucosoft.nighthawk_interteh_service.entities.Contract;
import com.iucosoft.nighthawk_interteh_web_cms.dto.ContractDTO;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 *
 * @author Dorina
 */
@Component
public class ContractConvertor {

    public Contract convert(ContractDTO contractDTO) {

        Contract contract = new Contract();

        contract.setIdContract(contractDTO.getIdContract());
        contract.setEmployercompany(contractDTO.getEmployercompany());
        contract.setNighthawkinterteh(contractDTO.getNighthawkinterteh());
        contract.setSubcontractor(contractDTO.getSubcontractor());
        contract.setContractType(contractDTO.getContractType());
        contract.setContractName(contractDTO.getContractName());
        contract.setContractDescription(contractDTO.getContractDescription());
        contract.setContractProjectId(contractDTO.getContractProjectId());
        contract.setContractProjects(contractDTO.getContractProjects());
        contract.setPayments(contractDTO.getPayments());
        return contract;

    }

    public ContractDTO convert(Contract contract) {
        ContractDTO contractDTO = new ContractDTO();

        contractDTO.setIdContract(contract.getIdContract());
        contractDTO.setEmployercompany(contract.getEmployercompany());
        contractDTO.setNighthawkinterteh(contract.getNighthawkinterteh());
        contractDTO.setSubcontractor(contract.getSubcontractor());
        contractDTO.setContractType(contract.getContractType());
        contractDTO.setContractName(contract.getContractName());
        contractDTO.setContractDescription(contract.getContractDescription());
        contractDTO.setContractProjectId(contract.getContractProjectId());
        contractDTO.setContractProjects(contract.getContractProjects());
        contractDTO.setPayments(contract.getPayments());

        return contractDTO;

    }

    public List<ContractDTO> convert(List<Contract> contractList) {
        List<ContractDTO> contractDTOList = new ArrayList<ContractDTO>();

        for (Contract contract : contractList) {
            ContractDTO contractDTO = convert(contract);
            contractDTOList.add(contractDTO);

        }

        return contractDTOList;

    }

}
