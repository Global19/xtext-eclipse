package org.eclipse.xtext.common.types.xtext.ui.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.common.types.xtext.ui.services.ContentAssistTestLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalContentAssistTestLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'default'", "'custom'", "'subtype'", "'generate'", "'import'", "'.*'", "'$'", "'.'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=5;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalContentAssistTestLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalContentAssistTestLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalContentAssistTestLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "InternalContentAssistTestLanguage.g"; }



     	private ContentAssistTestLanguageGrammarAccess grammarAccess;

        public InternalContentAssistTestLanguageParser(TokenStream input, ContentAssistTestLanguageGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected ContentAssistTestLanguageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalContentAssistTestLanguage.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalContentAssistTestLanguage.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalContentAssistTestLanguage.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalContentAssistTestLanguage.g:71:1: ruleModel returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_generateDirective_1_0= ruleGenerateDirective ) )? ( (lv_referenceHolder_2_0= ruleReferenceHolder ) )? ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_generateDirective_1_0 = null;

        EObject lv_referenceHolder_2_0 = null;



        	enterRule();

        try {
            // InternalContentAssistTestLanguage.g:77:2: ( ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_generateDirective_1_0= ruleGenerateDirective ) )? ( (lv_referenceHolder_2_0= ruleReferenceHolder ) )? ) )
            // InternalContentAssistTestLanguage.g:78:2: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_generateDirective_1_0= ruleGenerateDirective ) )? ( (lv_referenceHolder_2_0= ruleReferenceHolder ) )? )
            {
            // InternalContentAssistTestLanguage.g:78:2: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_generateDirective_1_0= ruleGenerateDirective ) )? ( (lv_referenceHolder_2_0= ruleReferenceHolder ) )? )
            // InternalContentAssistTestLanguage.g:79:3: ( (lv_imports_0_0= ruleImport ) )* ( (lv_generateDirective_1_0= ruleGenerateDirective ) )? ( (lv_referenceHolder_2_0= ruleReferenceHolder ) )?
            {
            // InternalContentAssistTestLanguage.g:79:3: ( (lv_imports_0_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalContentAssistTestLanguage.g:80:4: (lv_imports_0_0= ruleImport )
            	    {
            	    // InternalContentAssistTestLanguage.g:80:4: (lv_imports_0_0= ruleImport )
            	    // InternalContentAssistTestLanguage.g:81:5: lv_imports_0_0= ruleImport
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getImportsImportParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_imports_0_0=ruleImport();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"imports",
            	    						lv_imports_0_0,
            	    						"org.eclipse.xtext.common.types.xtext.ui.ContentAssistTestLanguage.Import");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalContentAssistTestLanguage.g:98:3: ( (lv_generateDirective_1_0= ruleGenerateDirective ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalContentAssistTestLanguage.g:99:4: (lv_generateDirective_1_0= ruleGenerateDirective )
                    {
                    // InternalContentAssistTestLanguage.g:99:4: (lv_generateDirective_1_0= ruleGenerateDirective )
                    // InternalContentAssistTestLanguage.g:100:5: lv_generateDirective_1_0= ruleGenerateDirective
                    {

                    					newCompositeNode(grammarAccess.getModelAccess().getGenerateDirectiveGenerateDirectiveParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_4);
                    lv_generateDirective_1_0=ruleGenerateDirective();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getModelRule());
                    					}
                    					set(
                    						current,
                    						"generateDirective",
                    						lv_generateDirective_1_0,
                    						"org.eclipse.xtext.common.types.xtext.ui.ContentAssistTestLanguage.GenerateDirective");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalContentAssistTestLanguage.g:117:3: ( (lv_referenceHolder_2_0= ruleReferenceHolder ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=11 && LA3_0<=13)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalContentAssistTestLanguage.g:118:4: (lv_referenceHolder_2_0= ruleReferenceHolder )
                    {
                    // InternalContentAssistTestLanguage.g:118:4: (lv_referenceHolder_2_0= ruleReferenceHolder )
                    // InternalContentAssistTestLanguage.g:119:5: lv_referenceHolder_2_0= ruleReferenceHolder
                    {

                    					newCompositeNode(grammarAccess.getModelAccess().getReferenceHolderReferenceHolderParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_referenceHolder_2_0=ruleReferenceHolder();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getModelRule());
                    					}
                    					set(
                    						current,
                    						"referenceHolder",
                    						lv_referenceHolder_2_0,
                    						"org.eclipse.xtext.common.types.xtext.ui.ContentAssistTestLanguage.ReferenceHolder");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleReferenceHolder"
    // InternalContentAssistTestLanguage.g:140:1: entryRuleReferenceHolder returns [EObject current=null] : iv_ruleReferenceHolder= ruleReferenceHolder EOF ;
    public final EObject entryRuleReferenceHolder() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceHolder = null;


        try {
            // InternalContentAssistTestLanguage.g:140:56: (iv_ruleReferenceHolder= ruleReferenceHolder EOF )
            // InternalContentAssistTestLanguage.g:141:2: iv_ruleReferenceHolder= ruleReferenceHolder EOF
            {
             newCompositeNode(grammarAccess.getReferenceHolderRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReferenceHolder=ruleReferenceHolder();

            state._fsp--;

             current =iv_ruleReferenceHolder; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReferenceHolder"


    // $ANTLR start "ruleReferenceHolder"
    // InternalContentAssistTestLanguage.g:147:1: ruleReferenceHolder returns [EObject current=null] : ( (otherlv_0= 'default' ( ( ruleFQN ) ) ) | (otherlv_2= 'custom' ( ( ruleFQN ) ) ) | (otherlv_4= 'subtype' ( ( ruleFQN ) ) ) ) ;
    public final EObject ruleReferenceHolder() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalContentAssistTestLanguage.g:153:2: ( ( (otherlv_0= 'default' ( ( ruleFQN ) ) ) | (otherlv_2= 'custom' ( ( ruleFQN ) ) ) | (otherlv_4= 'subtype' ( ( ruleFQN ) ) ) ) )
            // InternalContentAssistTestLanguage.g:154:2: ( (otherlv_0= 'default' ( ( ruleFQN ) ) ) | (otherlv_2= 'custom' ( ( ruleFQN ) ) ) | (otherlv_4= 'subtype' ( ( ruleFQN ) ) ) )
            {
            // InternalContentAssistTestLanguage.g:154:2: ( (otherlv_0= 'default' ( ( ruleFQN ) ) ) | (otherlv_2= 'custom' ( ( ruleFQN ) ) ) | (otherlv_4= 'subtype' ( ( ruleFQN ) ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt4=1;
                }
                break;
            case 12:
                {
                alt4=2;
                }
                break;
            case 13:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalContentAssistTestLanguage.g:155:3: (otherlv_0= 'default' ( ( ruleFQN ) ) )
                    {
                    // InternalContentAssistTestLanguage.g:155:3: (otherlv_0= 'default' ( ( ruleFQN ) ) )
                    // InternalContentAssistTestLanguage.g:156:4: otherlv_0= 'default' ( ( ruleFQN ) )
                    {
                    otherlv_0=(Token)match(input,11,FOLLOW_5); 

                    				newLeafNode(otherlv_0, grammarAccess.getReferenceHolderAccess().getDefaultKeyword_0_0());
                    			
                    // InternalContentAssistTestLanguage.g:160:4: ( ( ruleFQN ) )
                    // InternalContentAssistTestLanguage.g:161:5: ( ruleFQN )
                    {
                    // InternalContentAssistTestLanguage.g:161:5: ( ruleFQN )
                    // InternalContentAssistTestLanguage.g:162:6: ruleFQN
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getReferenceHolderRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getReferenceHolderAccess().getDefaultReferenceJvmTypeCrossReference_0_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    ruleFQN();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalContentAssistTestLanguage.g:178:3: (otherlv_2= 'custom' ( ( ruleFQN ) ) )
                    {
                    // InternalContentAssistTestLanguage.g:178:3: (otherlv_2= 'custom' ( ( ruleFQN ) ) )
                    // InternalContentAssistTestLanguage.g:179:4: otherlv_2= 'custom' ( ( ruleFQN ) )
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getReferenceHolderAccess().getCustomKeyword_1_0());
                    			
                    // InternalContentAssistTestLanguage.g:183:4: ( ( ruleFQN ) )
                    // InternalContentAssistTestLanguage.g:184:5: ( ruleFQN )
                    {
                    // InternalContentAssistTestLanguage.g:184:5: ( ruleFQN )
                    // InternalContentAssistTestLanguage.g:185:6: ruleFQN
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getReferenceHolderRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getReferenceHolderAccess().getCustomizedReferenceJvmTypeCrossReference_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    ruleFQN();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalContentAssistTestLanguage.g:201:3: (otherlv_4= 'subtype' ( ( ruleFQN ) ) )
                    {
                    // InternalContentAssistTestLanguage.g:201:3: (otherlv_4= 'subtype' ( ( ruleFQN ) ) )
                    // InternalContentAssistTestLanguage.g:202:4: otherlv_4= 'subtype' ( ( ruleFQN ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getReferenceHolderAccess().getSubtypeKeyword_2_0());
                    			
                    // InternalContentAssistTestLanguage.g:206:4: ( ( ruleFQN ) )
                    // InternalContentAssistTestLanguage.g:207:5: ( ruleFQN )
                    {
                    // InternalContentAssistTestLanguage.g:207:5: ( ruleFQN )
                    // InternalContentAssistTestLanguage.g:208:6: ruleFQN
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getReferenceHolderRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getReferenceHolderAccess().getSubtypeReferenceJvmTypeCrossReference_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    ruleFQN();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReferenceHolder"


    // $ANTLR start "entryRuleGenerateDirective"
    // InternalContentAssistTestLanguage.g:227:1: entryRuleGenerateDirective returns [EObject current=null] : iv_ruleGenerateDirective= ruleGenerateDirective EOF ;
    public final EObject entryRuleGenerateDirective() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGenerateDirective = null;


        try {
            // InternalContentAssistTestLanguage.g:227:58: (iv_ruleGenerateDirective= ruleGenerateDirective EOF )
            // InternalContentAssistTestLanguage.g:228:2: iv_ruleGenerateDirective= ruleGenerateDirective EOF
            {
             newCompositeNode(grammarAccess.getGenerateDirectiveRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGenerateDirective=ruleGenerateDirective();

            state._fsp--;

             current =iv_ruleGenerateDirective; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGenerateDirective"


    // $ANTLR start "ruleGenerateDirective"
    // InternalContentAssistTestLanguage.g:234:1: ruleGenerateDirective returns [EObject current=null] : (otherlv_0= 'generate' ( (lv_typeName_1_0= ruleQN ) ) ) ;
    public final EObject ruleGenerateDirective() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_typeName_1_0 = null;



        	enterRule();

        try {
            // InternalContentAssistTestLanguage.g:240:2: ( (otherlv_0= 'generate' ( (lv_typeName_1_0= ruleQN ) ) ) )
            // InternalContentAssistTestLanguage.g:241:2: (otherlv_0= 'generate' ( (lv_typeName_1_0= ruleQN ) ) )
            {
            // InternalContentAssistTestLanguage.g:241:2: (otherlv_0= 'generate' ( (lv_typeName_1_0= ruleQN ) ) )
            // InternalContentAssistTestLanguage.g:242:3: otherlv_0= 'generate' ( (lv_typeName_1_0= ruleQN ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getGenerateDirectiveAccess().getGenerateKeyword_0());
            		
            // InternalContentAssistTestLanguage.g:246:3: ( (lv_typeName_1_0= ruleQN ) )
            // InternalContentAssistTestLanguage.g:247:4: (lv_typeName_1_0= ruleQN )
            {
            // InternalContentAssistTestLanguage.g:247:4: (lv_typeName_1_0= ruleQN )
            // InternalContentAssistTestLanguage.g:248:5: lv_typeName_1_0= ruleQN
            {

            					newCompositeNode(grammarAccess.getGenerateDirectiveAccess().getTypeNameQNParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_typeName_1_0=ruleQN();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGenerateDirectiveRule());
            					}
            					set(
            						current,
            						"typeName",
            						lv_typeName_1_0,
            						"org.eclipse.xtext.common.types.xtext.ui.ContentAssistTestLanguage.QN");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGenerateDirective"


    // $ANTLR start "entryRuleImport"
    // InternalContentAssistTestLanguage.g:269:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalContentAssistTestLanguage.g:269:47: (iv_ruleImport= ruleImport EOF )
            // InternalContentAssistTestLanguage.g:270:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalContentAssistTestLanguage.g:276:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleImportedFQN ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;



        	enterRule();

        try {
            // InternalContentAssistTestLanguage.g:282:2: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleImportedFQN ) ) ) )
            // InternalContentAssistTestLanguage.g:283:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleImportedFQN ) ) )
            {
            // InternalContentAssistTestLanguage.g:283:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleImportedFQN ) ) )
            // InternalContentAssistTestLanguage.g:284:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleImportedFQN ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
            		
            // InternalContentAssistTestLanguage.g:288:3: ( (lv_importedNamespace_1_0= ruleImportedFQN ) )
            // InternalContentAssistTestLanguage.g:289:4: (lv_importedNamespace_1_0= ruleImportedFQN )
            {
            // InternalContentAssistTestLanguage.g:289:4: (lv_importedNamespace_1_0= ruleImportedFQN )
            // InternalContentAssistTestLanguage.g:290:5: lv_importedNamespace_1_0= ruleImportedFQN
            {

            					newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceImportedFQNParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_importedNamespace_1_0=ruleImportedFQN();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImportRule());
            					}
            					set(
            						current,
            						"importedNamespace",
            						lv_importedNamespace_1_0,
            						"org.eclipse.xtext.common.types.xtext.ui.ContentAssistTestLanguage.ImportedFQN");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleImportedFQN"
    // InternalContentAssistTestLanguage.g:311:1: entryRuleImportedFQN returns [String current=null] : iv_ruleImportedFQN= ruleImportedFQN EOF ;
    public final String entryRuleImportedFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleImportedFQN = null;


        try {
            // InternalContentAssistTestLanguage.g:311:51: (iv_ruleImportedFQN= ruleImportedFQN EOF )
            // InternalContentAssistTestLanguage.g:312:2: iv_ruleImportedFQN= ruleImportedFQN EOF
            {
             newCompositeNode(grammarAccess.getImportedFQNRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImportedFQN=ruleImportedFQN();

            state._fsp--;

             current =iv_ruleImportedFQN.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImportedFQN"


    // $ANTLR start "ruleImportedFQN"
    // InternalContentAssistTestLanguage.g:318:1: ruleImportedFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FQN_0= ruleFQN (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleImportedFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_FQN_0 = null;



        	enterRule();

        try {
            // InternalContentAssistTestLanguage.g:324:2: ( (this_FQN_0= ruleFQN (kw= '.*' )? ) )
            // InternalContentAssistTestLanguage.g:325:2: (this_FQN_0= ruleFQN (kw= '.*' )? )
            {
            // InternalContentAssistTestLanguage.g:325:2: (this_FQN_0= ruleFQN (kw= '.*' )? )
            // InternalContentAssistTestLanguage.g:326:3: this_FQN_0= ruleFQN (kw= '.*' )?
            {

            			newCompositeNode(grammarAccess.getImportedFQNAccess().getFQNParserRuleCall_0());
            		
            pushFollow(FOLLOW_6);
            this_FQN_0=ruleFQN();

            state._fsp--;


            			current.merge(this_FQN_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalContentAssistTestLanguage.g:336:3: (kw= '.*' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalContentAssistTestLanguage.g:337:4: kw= '.*'
                    {
                    kw=(Token)match(input,16,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getImportedFQNAccess().getFullStopAsteriskKeyword_1());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImportedFQN"


    // $ANTLR start "entryRuleFQN"
    // InternalContentAssistTestLanguage.g:347:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // InternalContentAssistTestLanguage.g:347:43: (iv_ruleFQN= ruleFQN EOF )
            // InternalContentAssistTestLanguage.g:348:2: iv_ruleFQN= ruleFQN EOF
            {
             newCompositeNode(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFQN=ruleFQN();

            state._fsp--;

             current =iv_ruleFQN.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFQN"


    // $ANTLR start "ruleFQN"
    // InternalContentAssistTestLanguage.g:354:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QN_0= ruleQN (kw= '$' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_2=null;
        AntlrDatatypeRuleToken this_QN_0 = null;



        	enterRule();

        try {
            // InternalContentAssistTestLanguage.g:360:2: ( (this_QN_0= ruleQN (kw= '$' this_ID_2= RULE_ID )* ) )
            // InternalContentAssistTestLanguage.g:361:2: (this_QN_0= ruleQN (kw= '$' this_ID_2= RULE_ID )* )
            {
            // InternalContentAssistTestLanguage.g:361:2: (this_QN_0= ruleQN (kw= '$' this_ID_2= RULE_ID )* )
            // InternalContentAssistTestLanguage.g:362:3: this_QN_0= ruleQN (kw= '$' this_ID_2= RULE_ID )*
            {

            			newCompositeNode(grammarAccess.getFQNAccess().getQNParserRuleCall_0());
            		
            pushFollow(FOLLOW_7);
            this_QN_0=ruleQN();

            state._fsp--;


            			current.merge(this_QN_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalContentAssistTestLanguage.g:372:3: (kw= '$' this_ID_2= RULE_ID )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==17) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalContentAssistTestLanguage.g:373:4: kw= '$' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,17,FOLLOW_5); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getFQNAccess().getDollarSignKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_7); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFQN"


    // $ANTLR start "entryRuleQN"
    // InternalContentAssistTestLanguage.g:390:1: entryRuleQN returns [String current=null] : iv_ruleQN= ruleQN EOF ;
    public final String entryRuleQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQN = null;


        try {
            // InternalContentAssistTestLanguage.g:390:42: (iv_ruleQN= ruleQN EOF )
            // InternalContentAssistTestLanguage.g:391:2: iv_ruleQN= ruleQN EOF
            {
             newCompositeNode(grammarAccess.getQNRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQN=ruleQN();

            state._fsp--;

             current =iv_ruleQN.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQN"


    // $ANTLR start "ruleQN"
    // InternalContentAssistTestLanguage.g:397:1: ruleQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalContentAssistTestLanguage.g:403:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalContentAssistTestLanguage.g:404:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalContentAssistTestLanguage.g:404:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalContentAssistTestLanguage.g:405:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQNAccess().getIDTerminalRuleCall_0());
            		
            // InternalContentAssistTestLanguage.g:412:3: (kw= '.' this_ID_2= RULE_ID )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==18) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalContentAssistTestLanguage.g:413:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,18,FOLLOW_5); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQNAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_8); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQNAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQN"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000000F802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000003802L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040002L});

}