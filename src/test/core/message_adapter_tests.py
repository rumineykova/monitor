import unittest
from conversation.conversation_types import ConversationMessage, Invitation, LocalType
from core.message_adapter import AMQPConversationMessageAdapter

class AMQPMessageAdapterTests(unittest.TestCase):
    def setUp(self):
        self.message_adapter = AMQPConversationMessageAdapter() 
    def test_from_conversation_msg(self):
        conv_msg = ConversationMessage(cid=1234,
                                       label='Order',
                                       content='Hello Worlds',
                                       sender_role='seller',
                                       receiver_role='buyer')
        
        expected_result = "12340006seller0005buyer0005Order0012Hello Worlds0000"
        actual_result = self.message_adapter.from_converastion_msg(conv_msg)
        self.assertEqual(actual_result, expected_result)
        
    def test_to_conversation_msg(self):
        row_msg = "12340006seller0005buyer0005Order0012Hello Worlds0000"
        expected_result = ConversationMessage(cid=1234,
                                               label='Order',
                                               content='Hello Worlds',
                                               sender_role='seller',
                                               receiver_role='buyer')
        actual_result = self.message_adapter.to_conversation_msg(row_msg)
        self.assertEqual(actual_result.__dict__, expected_result.__dict__)
        
    def test_from_invitation_msg(self):
        inv_msg = Invitation(cid = 1234, 
                             participant= '',
                             role="seller", 
                             local_capability="Ala Bala")
         
        expected_result = "12340003Adm0006seller0003inv0008Ala Bala00000000"
        actual_result = self.message_adapter.from_invitation_msg(inv_msg)
        self.assertEqual(actual_result, expected_result)

    def test_to_invitation_msg(self):
            expected_result = Invitation(cid = 1234, 
                                 participant= '',
                                 role="seller", 
                                 local_capability="Ala Bala")
             
            raw_msg = "12340003Adm0006seller0003inv0008Ala Bala0000"
            actual_result = self.message_adapter.to_invitation_msg(raw_msg)
            self.assertEqual(actual_result.__dict__, expected_result.__dict__)