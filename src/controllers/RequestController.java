package controllers;

import javax.swing.JOptionPane;

public class RequestController {

	
	/* Methods to execute the registration flow.
	 * 登録フローを実行するメソッド
	 * とうろく フロー を じっこう する メソッド
	 */

	public void registerRequest() {

		var clientName = JOptionPane.showInputDialog("Enter the client's name:");

		var valueRequest = JOptionPane.showInputDialog("Enter the request value:");

		if (valueRequest == null || valueRequest.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Value cannot be empty.");
			return;
		}

		var description = JOptionPane.showInputDialog("Enter the request description:");

		if (description == null || description.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Description cannot be empty.");
			return;
		}

		var status = JOptionPane
				.showInputDialog("Enter the request status (PENDING, PROCESSING, SENT, DELIVERED, CANCELED):");

		if (status == null || status.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Status cannot be empty.");
			return;
		}
		
		var request = new entities.Request();
		
		request.setClientName(clientName);
		request.setValueRequest(Double.parseDouble(valueRequest));
		request.setDescription(description);
		request.setStatus(enums.RequestStatus.valueOf(status));
		
		var requestRepository = new repositories.RequestRepository();
		
		requestRepository.insertRequest(request);

	}

}
